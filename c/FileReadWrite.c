#include <stdio.h>
#include <string.h>

int main(void) {

    FILE *file = fopen("file.txt", "w+");
    //write to file
    fprintf(file, "Shahin: Hi, how are you bro?\n");
    fprintf(file, "Khaled: Yah! I am fine and you?\n");
    fprintf(file, "Shahin: I am also fine :)");

    rewind(file);
    char *content[512];
    while(!feof(file)) {
        char *line[256];
        if(fgets(&line, 10, file) != NULL) {
            strcat(content, line);
        }
    }
    printf("Content of 'file.txt': \n%s", content);

    fclose(file);
    return 0;
}
