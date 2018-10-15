#include <stdio.h>

int main() {

    FILE *file = fopen("file.txt", "r");
    char word[64];
    int count = 0;

    while(fscanf(file, "%s", word) != -1) {
        printf("%s ", word);
        count++;
    }

    printf("\nWords: %d", count);

    fclose(file);
    return 0;
}
