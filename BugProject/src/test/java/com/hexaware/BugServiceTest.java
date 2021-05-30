package com.hexaware;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.hexaware.entity.BugRequest;
import com.hexaware.service.BugRepository;
import com.hexaware.service.BugService;
import com.hexaware.service.EmailClient;
//@RunWith(MockitoJUnitRunner.class)
@SpringBootTest()
public class BugServiceTest {
	@InjectMocks
	BugService bugService;
	@Mock
	BugRepository bugRepository;
	@Mock
	EmailClient emailClient; 
	@BeforeEach
    public void init() {
//        MockitoAnnotations.initMocks(this);
    }
	@Test
	public void testCreate() throws Exception {
		BugRequest bugRequest = new BugRequest();
		bugRequest.setId(12L);
		bugRequest.setDescription("tete");
		bugRequest.setEmailAddress("test@gmail.com");
		when(bugRepository.save(bugRequest)).thenReturn(bugRequest);
		bugService.create(bugRequest );
		assertEquals(12, bugRequest.getId());
//		verify(bugRequest.getId()).longValue();
	}
	@Test
	public void testCreateException() throws Exception {
		BugRequest bugRequest = new BugRequest();
		bugRequest.setId(12L);
		bugRequest.setDescription("tete");
//		when(bugRepository.save(bugRequest)).thenReturn(bugRequest);
		try {
			bugService.create(bugRequest );
		} catch (Exception e) {
			assertEquals(IllegalArgumentException.class, e.getClass());
		}
	}

}
