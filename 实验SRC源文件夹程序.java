package ui;  
import javax.swing.*; 
import java.awt.*;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  
import java.io.*;

public class Begin extends JFrame implements ActionListener {  
	//定义组件   
    JButton jb1,jb2,jb3,jb4=null;  
    JRadioButton jrb1,jrb2=null;  
    JPanel jp1,jp2,jp3,jp4,jp5,jp6,jp7,jp8,jp9,jp10,jp11=null;  
	JTextField jbf;
	JTextField jtf,jtf1;
	JTextField jrf=null;  
    JLabel jlb1,jlb2,jlb3,jlb4,jlb5,jlb6,jlb7,jlb8=null;  
    JPasswordField jpf=null;  
    ButtonGroup bg=null;  
    JComboBox jcb,jbb,jbb1,jbb2;
    JTextArea jt1;
	JTextArea jt2;
  
    final String ke="1";
    String je="2";
    String le="1";
    public static void main(String[] argv) throws Exception { 
    	Begin b=new Begin();

    } 
  
    public Begin() { 
        jb1=new JButton("登录");  
        jb2=new JButton("重置"); 
        jb3=new JButton("退出"); 
        jb4=new JButton("退课"); 

        //设置监听  
        jb1.addActionListener(this);  
        jb2.addActionListener(this);  
        jb3.addActionListener(this); 
        jb4.addActionListener(this);  
        jrb1=new JRadioButton("教师");  
        jrb2=new JRadioButton("学生");  
        bg=new ButtonGroup();  
        bg.add(jrb1);  
        bg.add(jrb2);  
        jrb2.setSelected(true);  //初始页面默认选择权限为 学生
        jp1=new JPanel();  
        jp2=new JPanel();  
        jp3=new JPanel();  
        jp4=new JPanel();                 //定义框架区域
        jp5=new JPanel();
        jp6=new JPanel();
        jp7=new JPanel();
        jp8=new JPanel();
        jp9=new JPanel();
        jp10=new JPanel();
        jp11=new JPanel();
              
        jlb1=new JLabel("用户名：");  
        jlb2=new JLabel("密    码：");  
        jlb3=new JLabel("权    限：");  
        jlb4=new JLabel("性别:");       
        jlb5=new JLabel("课  程");
        jlb6=new JLabel("出生年月:");
        jlb7=new JLabel("所属院系:");
        jlb8=new JLabel("所退课程:");
        
        String str1[]= {"女","男"};       
        jcb=new JComboBox(str1);
        String str2[]= {"年","1996","1997","1998","1999","2000","2001","2002"};       
        jbb=new JComboBox(str2);
        String str3[]= {"月","1","2","3","4","5","6","7","8","9","10","11","12"};       
        jbb1=new JComboBox(str3);
       
        jt1=new JTextArea(15,15);       //新建文本框
        jt2=new JTextArea(15,15); 
        
        jtf=new JTextField(10); 
        jtf1=new JTextField(10);
        
        jrf=new JTextField(10); 
        jbf=new JTextField(10);  
        jpf=new JPasswordField(10);  
        //加入到JPanel中  
        jp1.add(jlb1);  
        jp1.add(jbf);  
        
        jp2.add(jlb2);  
        jp2.add(jpf);  

        jp6.add(jlb3);      //添加标签
        jp6.add(jrb1);  
        jp6.add(jrb2);  

        jp4.add(jlb4);
        jp4.add(jcb);
        
        jp5.add(jlb5);
        jp5.add(jtf);
        
        jp3.add(jlb6);
        jp3.add(jbb);
        jp3.add(jbb1);

        jp7.add(jlb7);
        jp7.add(jrf);

        jp9.add(jt1);
        jp10.add(jt2);
        jp8.add(jb1);         //添加按钮
        jp8.add(jb2);  
        jp8.add(jb3); 
        jp11.add(jlb8);
        jp11.add(jtf1);
        jp11.add(jb4);
        //加入JFrame中  
        this.add(jp1);  
        this.add(jp2);  
        this.add(jp3);  
        this.add(jp4);  
        this.add(jp5); 
        this.add(jp6);
        this.add(jp7);
        this.add(jp8);
        this.setLayout(new GridLayout(6,2));            //选择GridLayout布局管理器   
        this.add(jp9);
        this.add(jp10);
        this.add(jp11);
      
        this.setTitle("管理系统");          
        this.setSize(400,400);         
        this.setLocation(400, 200); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //设置当关闭窗口时，保证JVM也退出 
        this.setVisible(true);  
        this.setResizable(true);  
    }
    
	public void actionPerformed(ActionEvent e) {            //事件判断
		
        if(e.getActionCommand()=="登录")  
        {  System.out.println(je);
        	
             if(jrb2.isSelected()) //学生在登录系统  
            {           
                 {
					try {
						stulogin();		
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}}
				} 
                  //连接到学生的方法 页面}
        }else if(e.getActionCommand()=="重置")  //清空界面
        {  
        	 clear();  
        }             
        else if(e.getActionCommand()=="退出"){
       	 dispose(); 						//关闭界面      
    }
        else if(e.getActionCommand()=="退课") {       //退课系统
			if(je.equals(jtf1.getText())) {
				je="已退课";
				System.out.println(je);
			}
		}

       
        	}
	public void stulogin() throws Exception 
	{  
    if(ke.equals(jtf.getText())) 
    	
    { Stu s=new Stu("26548","546","898",'5',"88");
    	jt1.setText("姓名:"+jbf.getText()+"  密码:"+jpf.getText()+"\n"+"性别"+
    jcb.getSelectedItem()+"  课程:"+jtf.getText()+"\n"+"出生年月: "+jbb.getSelectedItem()
    +"年"+jbb1.getSelectedIndex()+"月"+"\n"+"所属院系:"+jrf.getText());       
    	jt2.setText(s.toString());	
    	File f=new File("D:\\新建文件夹 (2).sss.txt");//确定写入TXT文件的存放位置
      	BufferedWriter writer=null;
    	writer=new BufferedWriter(new FileWriter(f,true));//不覆盖原有文件进行输入
      	String str=jt1.getText();  //转换成String格式
      	writer.write(str);//写入数据
    	writer.flush();//清空缓存
    	writer.close(); //关闭文件
      	try {
      		String encoding="GBK";//定义格式
    		InputStreamReader read=new InputStreamReader(new FileInputStream(f),encoding);
    		BufferedReader b=new BufferedReader(read);
    		String linetxt=null;//读取文件
    		while((linetxt=b.readLine())!=null) {
    			System.out.println(linetxt);//输出数据
    		}
    		read.close(); 
    		}
      	catch(Exception e) {
      		System.out.println("读取文件错误");//异常处理机制
      		e.printStackTrace();
      	}
    }else if(jbf.getText().isEmpty())  
    {  
        JOptionPane.showMessageDialog(null,"请输入课程！","提示消息",JOptionPane.WARNING_MESSAGE);  
    }else  
    {  
        JOptionPane.showMessageDialog(null,"课程错误！\n请重新输入","提示消息",JOptionPane.ERROR_MESSAGE);  
        //清空输入框  
        clear();  
    }  
}  
 
//清空文本框和密码框  
public  void clear()  
{  
    jbf.setText("");  
    jpf.setText("");  
    jcb.setSelectedItem("");
    jtf.setText("");
    jbb.setSelectedItem("年");
    jbb1.setSelectedItem("月");
    jrf.setText("");
}   
} 
  

package ui;

public class Stu extends Woc {

	int old;
	String sub2;//定义变量
	Stu(String a,String b,String c,int d,String e){
		super(a,b,c);
		old=d;sub2=e;
	}
	public int getOld() {return old;}
	public String getSub() {return sub2;}
	
	
	
	public String toString() {
		return"学生信息：编号："+bianhao+"\n"+"姓名:"+name+"\n"+"性别"+sex+"\n"+"年龄:"+old+"\n"+"所选课程:"+sub2;
	}

}


package ui;

//import asd.Ke;
//import asd.Ren;
import ui.Stu;
//import asd.Teacher;

public class Test {
	public static void main(String args[]) {
		
		Stu s=new Stu("26548","546","898",'5',"88");
		String[] a= {s.toString()};
		
		System.out.println(s.toString());
		System.out.println(a.toString());


	}
}
package ui;

public class Woc {//定义父本
	String bianhao;
	String name;
	String sex;
	Woc (String a,String b,String c){
		bianhao=a;
		name=b; 
		sex=c;//定义变量
	}
	public String getBianhao(){return bianhao;}
	public String getName() {return name;}
	public String getSex() {return sex;}//返回变量

}
