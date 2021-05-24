import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from "@angular/common/http";
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BugformComponent } from './bugform/bugform.component';
import BugService from './services/BugService';

@NgModule({
  declarations: [
    AppComponent,
    BugformComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule, HttpClientModule
  ],
  providers: [BugService],
  bootstrap: [AppComponent]
})
export class AppModule { }
