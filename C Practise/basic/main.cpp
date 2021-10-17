#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<ctype.h>

int checkKeyword(const char *s){
    char k[32][10] = {"auto","break","case","char","const","continue","default","do","double","else","enum","extern","float","for","goto","if","int","long","register","return","short","signed","sizeof","static","struct","switch","typedef","union","unsigned","void","volatile","while"};
    int i;
    for(i=0;i<32;i++)
        {
            if(strcmp(s,k[i]) == 0)
            {
                return 1;
            }
        }
    return 0;
}

int main()
{
     int count=0,intc=0,charc=0;
     char str[50],ch;
     FILE *fp=fopen("‪keylist.txt","r");
     if(fp == NULL)
     {
        printf("Error Opening the File\n");
        exit(1);
     }
    while((fscanf(fp,"%s",str)) != EOF)
    {
        if(checkKeyword(str)==1){
            count++;
            if(strcmp(str,"int")==0){
                ch=fgetc(fp);
                while(ch!=' '){
                    if(ch==',')
                        intc++;
                    intc++;
                }
            }
            else if(strcmp(str,"char")==0){
                ch=fgetc(fp);
                while(ch!=' '){
                    if(ch==',')
                        charc++;
                    charc++;
                }
            }
        }
    }
    fclose(fp);
    printf("No. of Keywords is %d\nNo. of Integers is %d\nNo. of Characters is %d\n",count,intc,charc);
    return 0;
 }
