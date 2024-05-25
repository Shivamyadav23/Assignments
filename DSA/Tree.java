
import java.util.Scanner;
class Tree{

Dnode root;

void init_tree()
    {
        root=null;
    }

void add_tree(Dnode r,Dnode n){

if (root==null) {
    
    root=n;
}

else{

 if( n.data<r.data){   
     if (r.left==null) 
    
      r.left=n;


else

    add_tree(r.left,n);



 }


 else{

   if(r.right==null)

    r.right=n;
   

else

    add_tree(r.right,n);



 }

}

   
}

void inorder(Dnode r){
if (r!=null) {
    
inorder(r.left);
System.out.println(""+r.data);
inorder(r.right);


}

}
int count(Dnode r){
int left,right;
if(r==null){
return 0;
}


else{
left=count(r.left);
right=count(r.right);

return left+right+1;

}
    
    }

int depth(Dnode r){
    
    int left,right;
if (r==null) {
    return 0;
}

else{
   left= depth(r.left);
    right=depth(r.right );

    return Math.max(left, right)+1;
}


}

int loadFactor(Dnode t){
int left, right;
    if (t==null) {
        return 0;
    }
    else{
left=loadFactor(t.left);
right=loadFactor(t.right);
return left-right;
    }

}





boolean search(Dnode r,int key){
boolean left,right;
if (r==null) 
    return false;
else{

if (r.data==key) {
    return true;
}


else{

   left= search(r.left,key);
   right=search(r.right, key);

return left||right;
}
}


}

public static void main(String[] args) {
    
 Tree t= new Tree();
Scanner sc= new Scanner(System.in);
int choice;
 do { 
     
System.out.println("select option 1-> AddNode 2->countnode 3->DepthOFTree 4->Indorder 5->Searing 6->Balanced check -0->Exit");

choice=sc.nextInt();

switch(choice){

case 1:
System.out.println("enter data to store in node");

int e=sc.nextInt();
Dnode n=new Dnode(e);
t.add_tree(t.root, n);
System.out.println("Data to inserted");
break;
case 2:
 System.out.println( "number of node in tree"+t.count(t.root));;

break;
case 3:
 System.out.println("depth of tree"+(t.depth(t.root)-1));
 break;
case 4:
 t.inorder(t.root);
break;
case 5:

   System.out.println("enter the data youwant to search");
   
   int s= sc.nextInt();
  System.out.println("found in tree"+t.search(t.root, s)); 
break;
case 6:
int a=t.loadFactor(t.root) ;
   
if (a<=1&&a>=-1) {
    System.out.println("tree is balanced");
}
else{
    System.out.println("tree is not  balanced");
}

break;
case 0:
System.out.println("Thanks for using Tree Application vist Again......");
break;

default:
System.out.println("invalid choice");



   }




}while(choice!=0);
}

}




