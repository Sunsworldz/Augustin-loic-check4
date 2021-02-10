import { Component, OnInit } from '@angular/core';
import { TestimoniesServiceService } from '../testimonies-service.service';

@Component({
  selector: 'app-testimonies-page',
  templateUrl: './testimonies-page.component.html',
  styleUrls: ['./testimonies-page.component.scss']
})
export class TestimoniesPageComponent implements OnInit {

  constructor( private testimoniesServiceService: TestimoniesServiceService) { }

  ngOnInit(): void {
  }

  // postTestimonies()
  //   this.testimoniesServiceService.getAllTestimonies().subscribe(data =>{console.log(data);})

}
