import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { TurmaComponent } from './turma/turma.component';
import { DisciplinaComponent } from './disciplina/disciplina.component';
import { CursoComponent } from './curso/curso.component';
import { AlunoComponent } from './aluno/aluno.component';

const routes: Routes = [
  {
    path: 'turma',
    component: TurmaComponent,
  },
  {
    path: 'curso',
    component: CursoComponent,
  },
  {
    path: 'disciplina',
    component: DisciplinaComponent,
  },
  {
    path: 'aluno',
    component: AlunoComponent,
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
