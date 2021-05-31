import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from "@angular/common/http";
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BugformComponent } from './bugform/bugform.component';
import BugService from './services/BugService';
import { LoginComponent } from './login/login.component';
import AuthService from './services/AuthService';

@NgModule({
  declarations: [
    AppComponent,
    BugformComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule, HttpClientModule
  ],
  providers: [BugService, AuthService],
  bootstrap: [AppComponent]
})
export class AppModule { }
