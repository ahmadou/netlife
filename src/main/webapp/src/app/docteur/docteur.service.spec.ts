import { TestBed, inject } from '@angular/core/testing';

import { DocteurService } from './docteur.service';

describe('DocteurService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [DocteurService]
    });
  });

  it('should be created', inject([DocteurService], (service: DocteurService) => {
    expect(service).toBeTruthy();
  }));
});
