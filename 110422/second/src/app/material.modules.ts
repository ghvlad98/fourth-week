import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { MatToolbarModule } from '@angular/material/toolbar';
import {MatProgressBarModule} from '@angular/material/progress-bar';
import {MatGridListModule} from '@angular/material/grid-list';

@NgModule({
    imports: [CommonModule, MatToolbarModule, MatProgressBarModule, MatGridListModule],
    exports: [CommonModule, MatToolbarModule, MatProgressBarModule, MatGridListModule],
  })
  export class MaterialModule { }