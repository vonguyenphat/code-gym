import { TestBed } from '@angular/core/testing';

import { ServiceFuramaServiceService } from './service-furama-service.service';

describe('ServiceFuramaServiceService', () => {
  let service: ServiceFuramaServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ServiceFuramaServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
