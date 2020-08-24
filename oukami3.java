import java.io.*;


class oukami3

{
 public static void main(String[] args) throws IOException
 {
	System.out.println("(オオカミ・ウマ・サカナの中から)オオカミくんを見つけてください。三回全員に質問します。ただし一匹だけすべての質問に嘘で答えます。");

	String[][] ani;
	ani = new String[3][3];

	//オオカミくん
	ani[0][0] = ("yes");
	ani[0][1] = ("yes");
	ani[0][2] = ("no");
	//ウマくん
	ani[1][0] = ("no");
	ani[1][1] = ("no");
	ani[1][2] = ("no");
	//サカナくん
	ani[2][0] = ("yes");
	ani[2][1] = ("no");
	ani[2][2] = ("yes");
//ランダムで嘘つきを決める
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


//毎回答えが同じにならないように配列をランダムで変える
	int num2 = (int) (Math.random()*3);
	//System.out.println("だいす２" + num2);
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
				System.out.println("質問１、とがった歯がありますか？");
				System.out.println("Aくんの答え" + ani2[0][0] + ",Bくんの答え" + ani2[1][0] + ",Cくんの答え" + ani2[2][0]);
				break;
			case 2:
				System.out.println("質問２、鋭い爪がありますか？");
				System.out.println("Aくんの答え" + ani2[0][1] + ",Bくんの答え" + ani2[1][1] + ",Cくんの答え" + ani2[2][1]);
				break;
			case 3:
				System.out.println("質問３、エラがありますか？");
				System.out.println("Aくんの答え" + ani2[0][2] + ",Bくんの答え" + ani2[1][2] + ",Cくんの答え" + ani2[2][2]);
				break;
		}
		n++;
		if(n <= 3){
			System.out.println("オオカミが誰かわかりましたか？わかったらyesまだわからなかったらそれ以外を入力してください");

			String str1 = br.readLine();
			if(str1.equals("yes")){
				n = 4;
				System.out.println("ok");
			}
		}
	}
	System.out.println("オオカミはだれ？A、B、Cのいずれかを入力");
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
  //毎回こたえが同じになってしまう問題があるのでランダム要素を今後くわえる
	if(n==0+num2){
		System.out.println("正解");
	}
	else{
		System.out.println("間違い");
	}

 }
}