import java.io.*;


class oukami3

{
 public static void main(String[] args) throws IOException
 {
	System.out.println("(�I�I�J�~�E�E�}�E�T�J�i�̒�����)�I�I�J�~����������Ă��������B�O��S���Ɏ��₵�܂��B��������C�������ׂĂ̎���ɉR�œ����܂��B");

	String[][] ani;
	ani = new String[3][3];

	//�I�I�J�~����
	ani[0][0] = ("yes");
	ani[0][1] = ("yes");
	ani[0][2] = ("no");
	//�E�}����
	ani[1][0] = ("no");
	ani[1][1] = ("no");
	ani[1][2] = ("no");
	//�T�J�i����
	ani[2][0] = ("yes");
	ani[2][1] = ("no");
	ani[2][2] = ("yes");
//�����_���ŉR�������߂�
	int num1 = (int) (Math.random()*3);

	//System.out.println(num1 + ani[num1][0] + ani[num1][1] + ani[num1][2]);

	for(int i=0; i<=2; i++){
		if(ani[num1][i] == ("yes")){
			ani[num1][i] = ("no");
		}
		else{
			ani[num1][i] = ("yes");
		}
	}
	//System.out.println(num1 + ani[num1][0] + ani[num1][1] + ani[num1][2]);


//���񓚂��������ɂȂ�Ȃ��悤�ɔz��������_���ŕς���
	int num2 = (int) (Math.random()*3);
	//System.out.println("�������Q" + num2);
	int pur1 = 0;
	int pur2 = 0;

	String[][] ani2;
	ani2 = new String[3][3];

	for(int x=0; x<=2; x++){
			for(int y=0; y<=2; y++){
				pur1 = x+num2;
				
				if(pur1 >= 3){
					pur1 = pur1-3;
				}
				ani2[x][y] = ani[pur1][y];

			}
	}

	int n = 1;

	BufferedReader br =
	new BufferedReader(new InputStreamReader(System.in));

	while(n <= 3){
		switch(n){
			case 1:
				System.out.println("����P�A�Ƃ�������������܂����H");
				System.out.println("A����̓���" + ani2[0][0] + ",B����̓���" + ani2[1][0] + ",C����̓���" + ani2[2][0]);
				break;
			case 2:
				System.out.println("����Q�A�s���܂�����܂����H");
				System.out.println("A����̓���" + ani2[0][1] + ",B����̓���" + ani2[1][1] + ",C����̓���" + ani2[2][1]);
				break;
			case 3:
				System.out.println("����R�A�G��������܂����H");
				System.out.println("A����̓���" + ani2[0][2] + ",B����̓���" + ani2[1][2] + ",C����̓���" + ani2[2][2]);
				break;
		}
		n++;
		if(n <= 3){
			System.out.println("�I�I�J�~���N���킩��܂������H�킩������yes�܂��킩��Ȃ������炻��ȊO����͂��Ă�������");

			String str1 = br.readLine();
			if(str1.equals("yes")){
				n = 4;
				System.out.println("ok");
			}
		}
	}
	System.out.println("�I�I�J�~�͂���HA�AB�AC�̂����ꂩ�����");
	String str2 = br.readLine();
	switch(str2){
		case "A":
			n = 0;
			break;
		case "B":
			n = 1;
			break;
		case "C":
			n = 2;
			break;
	}
  //���񂱂����������ɂȂ��Ă��܂���肪����̂Ń����_���v�f�����キ�킦��
	if(n==0+num2){
		System.out.println("����");
	}
	else{
		System.out.println("�ԈႢ");
	}

 }
}