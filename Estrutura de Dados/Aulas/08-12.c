#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct Aluno{
    char nome[20];
    int matricula;
    float nota;
} Aluno;

int main(){

    Aluno alunos[3];
    int i;

    for(i =0;i<3;i++){
        scanf("%d", &alunos[i].matricula);
        scanf("%f", &alunos[i].nota);
        scanf("%s", &alunos[i].nome);
    }

    for(i =0;i<3;i++){
        printf("%d", alunos[i].matricula);
        printf("%f", alunos[i].nota);
        printf("%s", alunos[i].nome);
    }

return 0;
}