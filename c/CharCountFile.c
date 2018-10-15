#include <stdio.h>

int main() {

    FILE *file = fopen("file.txt", "r");
    char chars;
    int count = 0;

    while((chars = fgetc(file)) != -1) {
        /*if(chars == ' ') {
            printf(" ");
        } else if(chars == '\n') {
            printf("\n");
        }*/
        printf("%c", chars);
        count++;
    }

    printf("\nCharacters: %d", count);

    fclose(file);
    return 0;
}
