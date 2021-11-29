#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *left;
    struct node *right;
};

void printPreOrder(struct node *node);
void printInOrder(struct node *node);
void printPostOrder(struct node *node);

struct node *newNode(int data)
{
    struct node *new = (struct node *)malloc(sizeof(struct node));
    new->data = data;
    new->left = NULL;
    new->right = NULL;

    return new;
}

void printPreOrder(struct node *node)
{
    if (node == NULL)
    {
        return;
    }
    printf("%d ", node->data);
    printPreOrder(node->left);
    printPreOrder(node->right);
}

void printInOrder(struct node *node)
{
    if (node == NULL)
    {
        return;
    }

    printInOrder(node->left);
    printf("%d ", node->data);
    printInOrder(node->right);
}

void printPostOrder(struct node *node)
{
    if (node == NULL)
    {
        return;
    }

    printPostOrder(node->left);
    printPostOrder(node->right);
    printf("%d ", node->data);
}

int main()
{
    struct node *root = newNode(1);
    root->left = newNode(2);
    root->right = newNode(3);
    root->left->left = newNode(4);
    root->left->right = newNode(5);

    printf("\nPreorder traversal of binary tree is \n");
    printPreOrder(root);

    printf("\nInorder traversal of binary tree is \n");
    printInOrder(root);

    printf("\nPostorder traversal of binary tree is \n");
    printPostOrder(root);

    return 0;
}