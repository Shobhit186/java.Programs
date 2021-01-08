import java.util.Scanner;
public class Solution1
{
public static void main(String[] args) {
//Document obj1=new Document(1,"intro","intro_details",10);
//Document obj2=new Document(2,"contents","contents_details",3);
//Document obj3=new Document(3,"history","history_details",25);
//Document obj4=new Document(4,"war","war_details",38);
Document arr[]=new Document[4];
Scanner sc = new Scanner(System.in);
for(int i=0;i<4;i++)
{
	int a = sc.nextInt();sc.nextLine();
	String b = sc.nextLine();
	String c= sc.nextLine();
	int d = sc.nextInt();
	arr[i] = new Document(a,b,c,d);
}
combineDocument(arr);
}
public static void combineDocument(Document[] arrayobj){
int id=0,pages=0,arrlen=arrayobj.length;
System.out.println("id: "+(arrayobj.length+1));
System.out.println("Titles: "+arrayobj[0].getTitle()+"#"+arrayobj[1].getTitle()+"#"+arrayobj[2].getTitle()+"#"+arrayobj[3].getTitle());
System.out.println("Folders: "+arrayobj[0].getFolderName()+"@"+arrayobj[1].getFolderName()+"@"+arrayobj[2].getFolderName()
+"@"+arrayobj[3].getFolderName());
for(int i=0;i<arrayobj.length;i++)pages=pages+arrayobj[i].getPages();
System.out.println("Pages: "+pages);
}
}

class Document{
 int id;
 String title;
 String folderName;
 int pages;
public Document(int id,String title,String folderName,int pages){
//super();

this.id=id;
this.title=title;
this.folderName=folderName;
this.pages=pages;
}
public int getId(){
return id;
}
public String getTitle(){
return title;
}
public String getFolderName(){
return folderName;
}
public int getPages(){
return pages;
}
}
