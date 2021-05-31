import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BugformComponent } from './bugform/bugform.component';
import { LoginComponent } from './login/login.component';

const routes: Routes = [{ path: "", redirectTo: 'login', pathMatch:"full" },
{ path: 'login', component: LoginComponent },
{ path: 'home', component: BugformComponent }];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
