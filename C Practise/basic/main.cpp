#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <limits.h>
#define SIZE 10
int costMartix[10][10]={{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,1,0,0},{0,1,0,0,0,0},{1,1,0,0,0,0},{1,0,1,0,0,0}};
int visited[10]={0};
int stk[10];
int incre=0;

void dfs(int vertex,int n){
    int i,j=0;
    for(i=0;i<n;i++){
        if(costMartix[vertex][i]==1&&!visited[i]){
            j++;
            //printf("Row is %d and Column is %d\n",vertex,i);
            visited[vertex]=1;
            dfs(i,n);
            stk[incre++]=vertex;
        }
    }
    if(j==0&&!visited[vertex]){
            visited[vertex]=1;
            stk[incre++]=vertex;
    }
}

int main()
{
    int i,j,n=6;
    for(i=0;i<n;i++){
        if(visited[i]==0){
            printf("Vertex is %d\n",i);
            dfs(i,n);
        }
    }
    printf("Topological Sorting is\n");
    for(i=incre-1;i>=0;i--){
        printf("%d\t",stk[i]);
    }
    return 0;
}

