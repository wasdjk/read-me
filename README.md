# read-me
计181 2018310739 张学斌
实验目的
  分析学生选课系统
  使用GUI窗体及其组件设计窗体界面
  完成学生选课过程业务逻辑编程
  基于文件保存并读取数据
  处理异常
实验要求
  一、系统角色分析及类设计
    例如：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择课程。
    定义每种角色人员的属性，及其操作方法。
    属性示例：	人员（编号、姓名、性别……）
    教师（编号、姓名、性别、所授课程、……）
		学生（编号、姓名、性别、所选课程、……）
		课程（编号、课程名称、上课地点、时间、授课教师、……）
    以上属性仅为示例，同学们可以自行扩展。
  二、要求:
    1、设计GUI窗体，支持学生注册、课程新加、学生选课、学生退课、打印学生选课列表等操作。
    2、基于事件模型对业务逻辑编程，实现在界面上支持上述操作。
    3、针对操作过程中可能会出现的各种异常，做异常处理
    4、基于输入/输出编程，支持学生、课程、教师等数据的读写操作。
    5、基于Github.com提交实验，包括实验SRC源文件夹程序、README.MD实验报告文档。
    6、本次实验是综合性实验，在40%的实验成绩中占比最大，望同学们认真对待。
    7、提交截止时间：12月8日。
实验过程
    在上次实验设计GUI窗体，支持学生注册、课程新加、学生选课、学生退课、打印学生选课等操作。
基于事件模型对业务逻辑编程，实现在界面上支持上述操作。针对操作过程中可能会出现的各种异
常，做异常处理的基础上添加TXT文件的录入和读取操作，将文件的录入与读取操作写入stdulogin( )
函数当中，建立一个File f写入TXT文件所在的位置，将输入GUI系统中的数据转化成String格式，再
通过BufferedWriter输入到TXT文件中去，加上flush放着覆盖提前输入的数据，最后close（）关闭
文件。之后在编写读取文件的代码，运用BufferedReader的方法读取TXT中的数据并输出数来，最后再
添加上异常处理程序。
流程图
核心代码和注释
public void actionPerformed(ActionEvent e) {            //事件判断

        if(e.getActionCommand()=="登录")  
        {  
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
}}
 Stu s=new Stu("26548","546","898",'5',"88");
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
系统运行截图
三、编程感想
    在本次实验是通过在上次实验设计GUI窗体，支持学生注册、课程新加、学生选课、学生退课、打印学生
选课等操作。基于事件模型对业务逻辑编程，实现在界面上支持上述操作。在对其进行异常处理等操作，
最后调用TXT文件进行读取与录入，本次试验中遇到了许许多多的问题，从一开始调用不到目标文件，到
最终的成功调用，从一开始的不能把数据录入TXT文件当中到最后的成功录入，在本次编程的过程中是我
深刻体会到自己对文件的操作还是不太熟练，还需要多多学习。
