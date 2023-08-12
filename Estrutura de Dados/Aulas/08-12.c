#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){
	
	setlocale(LC_ALL, "Portuguese");

    //int lista[10] = {1,2,3,4,5,6,7,8,9,10};
    int *lista;
    int  i;

    for(i=0;i<10;i++){
        lista[i] = i + 1;
    }

    for(i=0;i<10;i++){
        printf("%d: %d\n", i, lista[i]);
    }

return 0;
}