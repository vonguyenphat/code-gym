import { TestBed } from '@angular/core/testing';

import { RentypeServiceService } from './rentype-service.service';

describe('RentypeServiceService', () => {
  let service: RentypeServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(RentypeServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
