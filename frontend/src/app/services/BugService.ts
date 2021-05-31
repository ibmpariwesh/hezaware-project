import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import Bug from '../Bug';
const BASE_URL = "http://localhost:8085/bug"
@Injectable()
export default class BugService{
    constructor(private http: HttpClient){
        
    }
    
    sendSaveRequest(bug:Bug){
       return this.http.post(BASE_URL, bug,{
            headers:{
                "content-type":"application/json"
            }
        });
    }
}