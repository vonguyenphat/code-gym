import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ServiceFuramaClinetComponent } from './service-furama-clinet.component';

describe('ServiceFuramaClinetComponent', () => {
  let component: ServiceFuramaClinetComponent;
  let fixture: ComponentFixture<ServiceFuramaClinetComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ServiceFuramaClinetComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ServiceFuramaClinetComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
