import { TestBed } from '@angular/core/testing';

import { TestimoniesServiceService } from './testimonies-service.service';

describe('TestimoniesServiceService', () => {
  let service: TestimoniesServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TestimoniesServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
