#include <stdio.h>

int main() {

    FILE *file = fopen("file.txt", "r");
    char *line[128];
    int count = 0;

    while(fgets(&line, 128, file)) {
        if(line != NULL) {
            printf("%s", line);
            count++;
        }
    }
    printf("\nLines: %d", count);
    fclose(file);
    return 0;
}
