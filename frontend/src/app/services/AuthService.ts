import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
@Injectable()
export default class AuthService {
    constructor(private http: HttpClient) {

    }
    login(username: string, pwd: string) {
        const headers = new HttpHeaders({
            Authorization: 'Basic ' + btoa(username + ":" + pwd),
            // "Access-Control-Allow-Origin":"*",
            // "Access-Control-Request-Method":"*"
        })
        return this.http.get("http://localhost:8085", {
            headers, responseType: 'text' as 'json'
        })
    }
} 