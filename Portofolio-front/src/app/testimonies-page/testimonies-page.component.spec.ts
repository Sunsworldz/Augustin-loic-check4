import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TestimoniesPageComponent } from './testimonies-page.component';

describe('TestimoniesPageComponent', () => {
  let component: TestimoniesPageComponent;
  let fixture: ComponentFixture<TestimoniesPageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TestimoniesPageComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TestimoniesPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
