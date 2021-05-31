import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import AuthService from '../services/AuthService';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent  {
  username: string = 'pariwesh';
  password: string = 'techie123';
  message: any;
  constructor(private authService:AuthService, private router : Router) { }

  login() {
    const observable = this.authService.login(this.username, this.password);
    observable.subscribe(reponse => {
      this.message = reponse;
      this.router.navigate(["/home"]);
    })
  }

}
