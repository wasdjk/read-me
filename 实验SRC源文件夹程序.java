package ui;  
import javax.swing.*; 
import java.awt.*;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  
import java.io.*;

public class Begin extends JFrame implements ActionListener {  
	//�������   
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
        jb1=new JButton("��¼");  
        jb2=new JButton("����"); 
        jb3=new JButton("�˳�"); 
        jb4=new JButton("�˿�"); 

        //���ü���  
        jb1.addActionListener(this);  
        jb2.addActionListener(this);  
        jb3.addActionListener(this); 
        jb4.addActionListener(this);  
        jrb1=new JRadioButton("��ʦ");  
        jrb2=new JRadioButton("ѧ��");  
        bg=new ButtonGroup();  
        bg.add(jrb1);  
        bg.add(jrb2);  
        jrb2.setSelected(true);  //��ʼҳ��Ĭ��ѡ��Ȩ��Ϊ ѧ��
        jp1=new JPanel();  
        jp2=new JPanel();  
        jp3=new JPanel();  
        jp4=new JPanel();                 //����������
        jp5=new JPanel();
        jp6=new JPanel();
        jp7=new JPanel();
        jp8=new JPanel();
        jp9=new JPanel();
        jp10=new JPanel();
        jp11=new JPanel();
              
        jlb1=new JLabel("�û�����");  
        jlb2=new JLabel("��    �룺");  
        jlb3=new JLabel("Ȩ    �ޣ�");  
        jlb4=new JLabel("�Ա�:");       
        jlb5=new JLabel("��  ��");
        jlb6=new JLabel("��������:");
        jlb7=new JLabel("����Ժϵ:");
        jlb8=new JLabel("���˿γ�:");
        
        String str1[]= {"Ů","��"};       
        jcb=new JComboBox(str1);
        String str2[]= {"��","1996","1997","1998","1999","2000","2001","2002"};       
        jbb=new JComboBox(str2);
        String str3[]= {"��","1","2","3","4","5","6","7","8","9","10","11","12"};       
        jbb1=new JComboBox(str3);
       
        jt1=new JTextArea(15,15);       //�½��ı���
        jt2=new JTextArea(15,15); 
        
        jtf=new JTextField(10); 
        jtf1=new JTextField(10);
        
        jrf=new JTextField(10); 
        jbf=new JTextField(10);  
        jpf=new JPasswordField(10);  
        //���뵽JPanel��  
        jp1.add(jlb1);  
        jp1.add(jbf);  
        
        jp2.add(jlb2);  
        jp2.add(jpf);  

        jp6.add(jlb3);      //��ӱ�ǩ
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
        jp8.add(jb1);         //��Ӱ�ť
        jp8.add(jb2);  
        jp8.add(jb3); 
        jp11.add(jlb8);
        jp11.add(jtf1);
        jp11.add(jb4);
        //����JFrame��  
        this.add(jp1);  
        this.add(jp2);  
        this.add(jp3);  
        this.add(jp4);  
        this.add(jp5); 
        this.add(jp6);
        this.add(jp7);
        this.add(jp8);
        this.setLayout(new GridLayout(6,2));            //ѡ��GridLayout���ֹ�����   
        this.add(jp9);
        this.add(jp10);
        this.add(jp11);
      
        this.setTitle("����ϵͳ");          
        this.setSize(400,400);         
        this.setLocation(400, 200); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //���õ��رմ���ʱ����֤JVMҲ�˳� 
        this.setVisible(true);  
        this.setResizable(true);  
    }
    
	public void actionPerformed(ActionEvent e) {            //�¼��ж�
		
        if(e.getActionCommand()=="��¼")  
        {  System.out.println(je);
        	
             if(jrb2.isSelected()) //ѧ���ڵ�¼ϵͳ  
            {           
                 {
					try {
						stulogin();		
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}}
				} 
                  //���ӵ�ѧ���ķ��� ҳ��}
        }else if(e.getActionCommand()=="����")  //��ս���
        {  
        	 clear();  
        }             
        else if(e.getActionCommand()=="�˳�"){
       	 dispose(); 						//�رս���      
    }
        else if(e.getActionCommand()=="�˿�") {       //�˿�ϵͳ
			if(je.equals(jtf1.getText())) {
				je="���˿�";
				System.out.println(je);
			}
		}

       
        	}
	public void stulogin() throws Exception 
	{  
    if(ke.equals(jtf.getText())) 
    	
    { Stu s=new Stu("26548","546","898",'5',"88");
    	jt1.setText("����:"+jbf.getText()+"  ����:"+jpf.getText()+"\n"+"�Ա�"+
    jcb.getSelectedItem()+"  �γ�:"+jtf.getText()+"\n"+"��������: "+jbb.getSelectedItem()
    +"��"+jbb1.getSelectedIndex()+"��"+"\n"+"����Ժϵ:"+jrf.getText());       
    	jt2.setText(s.toString());	
    	File f=new File("D:\\�½��ļ��� (2).sss.txt");//ȷ��д��TXT�ļ��Ĵ��λ��
      	BufferedWriter writer=null;
    	writer=new BufferedWriter(new FileWriter(f,true));//������ԭ���ļ���������
      	String str=jt1.getText();  //ת����String��ʽ
      	writer.write(str);//д������
    	writer.flush();//��ջ���
    	writer.close(); //�ر��ļ�
      	try {
      		String encoding="GBK";//�����ʽ
    		InputStreamReader read=new InputStreamReader(new FileInputStream(f),encoding);
    		BufferedReader b=new BufferedReader(read);
    		String linetxt=null;//��ȡ�ļ�
    		while((linetxt=b.readLine())!=null) {
    			System.out.println(linetxt);//�������
    		}
    		read.close(); 
    		}
      	catch(Exception e) {
      		System.out.println("��ȡ�ļ�����");//�쳣�������
      		e.printStackTrace();
      	}
    }else if(jbf.getText().isEmpty())  
    {  
        JOptionPane.showMessageDialog(null,"������γ̣�","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);  
    }else  
    {  
        JOptionPane.showMessageDialog(null,"�γ̴���\n����������","��ʾ��Ϣ",JOptionPane.ERROR_MESSAGE);  
        //��������  
        clear();  
    }  
}  
 
//����ı���������  
public  void clear()  
{  
    jbf.setText("");  
    jpf.setText("");  
    jcb.setSelectedItem("");
    jtf.setText("");
    jbb.setSelectedItem("��");
    jbb1.setSelectedItem("��");
    jrf.setText("");
}   
} 
  

package ui;

public class Stu extends Woc {

	int old;
	String sub2;//�������
	Stu(String a,String b,String c,int d,String e){
		super(a,b,c);
		old=d;sub2=e;
	}
	public int getOld() {return old;}
	public String getSub() {return sub2;}
	
	
	
	public String toString() {
		return"ѧ����Ϣ����ţ�"+bianhao+"\n"+"����:"+name+"\n"+"�Ա�"+sex+"\n"+"����:"+old+"\n"+"��ѡ�γ�:"+sub2;
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

public class Woc {//���常��
	String bianhao;
	String name;
	String sex;
	Woc (String a,String b,String c){
		bianhao=a;
		name=b; 
		sex=c;//�������
	}
	public String getBianhao(){return bianhao;}
	public String getName() {return name;}
	public String getSex() {return sex;}//���ر���

}
