import { TestBed } from '@angular/core/testing';

import { ServiceDivServiceService } from './service-div-service.service';

describe('ServiceDivServiceService', () => {
  let service: ServiceDivServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ServiceDivServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
