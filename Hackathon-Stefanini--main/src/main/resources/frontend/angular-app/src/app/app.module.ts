import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TopbarComponent } from './topbar/topbar.component';
import { TurmaComponent } from './turma/turma.component';
import { CursoComponent } from './curso/curso.component';
import { DisciplinaComponent } from './disciplina/disciplina.component';
import { AlunoComponent } from './aluno/aluno.component';

@NgModule({
  declarations: [
    AppComponent,
    TopbarComponent,
    TurmaComponent,
    CursoComponent,
    DisciplinaComponent,
    AlunoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
