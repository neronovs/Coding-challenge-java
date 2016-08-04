#include <stdio.h>
#include <cs50.h>

int main(void)
{
    int height, length;
    do {
        printf("height: ");
        height = GetInt();
    } while (height < 0 || height > 23);
    length = height - 1;
    
    for (int i = 0; i < height; i++) {
        for (int o = 0; o < length; o++) {
            printf(" ");
        }
        for (int o = 0; o < height + 1 -length; o++) {
            printf("#");
        }
        length--;
        printf("\n");
    }
}
