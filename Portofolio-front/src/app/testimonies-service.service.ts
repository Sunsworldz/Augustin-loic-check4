import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TestimoniesServiceService {

  url: string = "http://localhost:8080/";

  constructor(private http:HttpClient) { }

//   getAllTestimonies(road:string):Observable<Testimonies[]>{
//     const myUrl: string this.url;
//     return this.http.get<Testimonies[]>(myUrl + "testimonies");
//  }

//   postTestimonies(){
//   return this.http.post(this.url + "testimonies");
//   }
}
