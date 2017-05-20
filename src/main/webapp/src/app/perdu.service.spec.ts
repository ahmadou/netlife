import { TestBed, inject } from '@angular/core/testing';

import { PerduService } from './perdu/perdu.service';

describe('PerduService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [PerduService]
    });
  });

  it('should be created', inject([PerduService], (service: PerduService) => {
    expect(service).toBeTruthy();
  }));
});
