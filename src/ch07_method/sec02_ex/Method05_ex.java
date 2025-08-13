package ch07_method.sec02_ex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * 학생 성적 관리 프로그램
 * 기능
 * - 1. 학생 성적 입력 (이름, 국어, 영어, 수학
 * - 2. 학생 목록 출력 (번호, 이름 국어, 영어, 수학, 총점, 평균
 * - 3. 특정 학생 성적 수정
 * - 4. 특정 학생 삭제
 * - 5. 학생 검색
 * - 6. 프로그램 종료
 * <p>
 * 데이터 구조
 * String[] name: 학생 이름 저장
 * int[][] score: 국/영/수 점수 저장
 * int[] totals: 총점 저장
 * double[] avgs: 평균 저장
 * <p>
 * 최대 학생 수: MAX_STUDENT = 5
 * 학생수는 count로 관리
 */
public class Method05_ex {
	
	/**
	 * 메뉴판 출력하고 입력값을 반환하는 메서드
	 * @return 입력값을 반환
	 */
	public static int getMenu(Scanner scanner) {
      System.out.println("┌───────[성적 관리 프로그램]─────────┐");
      System.out.println("│   1. 입력                          │");
      System.out.println("│   2. 출력                      │");
      System.out.println("│   3. 수정                      │");
      System.out.println("│   4. 삭제                      │");
      System.out.println("│   5. 검색                      │");
      System.out.println("│   6. 출력2(총점순)               │");
      System.out.println("│   7. 파일로 저장                 │");
      System.out.println("│   8. 파일 로드                  │");
      System.out.println("│   0. 종료                      │");
      System.out.println("└───────────────────────────────┘");
      System.out.print("선택: ");
      int memu = scanner.nextInt();
      return memu;
	}
	
	// 이름, 점수(국영수), 총점, 평균점수
	public static int createStudent(int studentCount, String[] name, int[][] scores, int[] totals, double[] totalsAverages, Scanner scanner) {
        System.out.print("이름: ");
        name[studentCount] = scanner.next();
        System.out.print("국어: ");
        scores[studentCount][0] = scanner.nextInt();
        System.out.print("영어: ");
        scores[studentCount][1] = scanner.nextInt();
        System.out.print("수학: ");
        scores[studentCount][2] = scanner.nextInt();

        System.out.println("┌────◆────┐");
        System.out.println("│     생성 완료      │");
        System.out.println("└─────◆───┘");
        studentCount++;
       
       calcSum(studentCount, scores , totals); // sum 계산
       calcAvg(studentCount, totalsAverages, totals); // avg 계산
       return studentCount;
	}
	
	// sum 계산 함수
	public static void calcSum(int studentCount, int[][] scores , int[] totals) {
//		System.out.println("하쿠생수: "+studentCount);
		int sum = 0;
		for(int i = 0; i < scores[studentCount-1].length; i++) {
			sum += scores[studentCount-1][i];
		}
		totals[studentCount-1] = sum;
		
//		System.out.println("calcSum 함수 테스트");
//		for(int n : scores[0]) {
//			System.out.println(n);
//		}
//		System.out.println("함수 테스트 끝");
	}
	
	/**
	 * 평균 계산 함수
	 */
	public static void calcAvg(int studentCount, double[] totalsAverages, int[] totals) {
		double avg = totals[studentCount-1] / 3.0;
		System.out.println("평균 테스트:"+avg);
		totalsAverages[studentCount-1] = avg;
	}
	
	public static void getPrint(int studentCount, String[] name, int[][] scores, int[] totals, double[] totalsAverages, Scanner scanner) {
        System.out.print("번호\t이름\t국어\t영어\t수학\t총점\t평균\n");
      for (int i = 0; i < studentCount; i++) { // 학생 수 만큼 반복
          if (name[i] != null) {
              System.out.print( (i+1) + "\t");
              System.out.print(name[i] + "\t");
              // 국영수 출력
              for (int j = 0; j < scores[i].length; j++) { // scores[i].length = 3
                  System.out.print(scores[i][j] + "\t");
              }
              System.out.print(totals[i] + "\t");
              System.out.print(String.format("%.2f", totalsAverages[i]));
              System.out.println();
		
          }
      }
      System.out.println("┌─────◆────┐");
      System.out.println("│ 출력완료             │");
      System.out.println("└─────◆────┘");
	}
	public static boolean isValidUpdate(int updateNum, String[] name) {
	     int idx = updateNum - 1;
         // 범위 안에 있는지 + 해당 번호가 존재하는지
         if (updateNum > MAX_STUDENT) { // 수정하려는 번호가 5이상
             System.out.println("┌─────◇─────┐");
             System.out.println("│ 수정하려는 번호가 큽니다.  │");
             System.out.println("└─────◇─────┘");
             return false;
         }
         if (updateNum <= 0) {
             System.out.println("┌─────────◇───────┐");
             System.out.println("│ 수정하려는 번호가 0 이거나 음수입니다.   │");
             System.out.println("└─────────◇───────┘");
             return false;
         }
         // 삭제한 경우 표시 X
         if (name[idx] == null) {
             System.out.println("┌────◇──────┐");
             System.out.println("│ 수정할려는 사람이 없습니다  │");
             System.out.println("└────◇──────┘");
             return false;
         }

         return true;
	}
	public static void updateStudent(String[] name,int[][] scores,int updateNum, Scanner scanner, int studentCount,
			int[] totals, double[] totalsAverages) {
        int idx = updateNum - 1;

    	System.out.print("이름: ");
        name[idx] = scanner.next();
        System.out.print("국어: ");
        scores[idx][0] = scanner.nextInt();
        System.out.print("영어: ");
        scores[idx][1] = scanner.nextInt();
        System.out.print("수학: ");
        scores[idx][2] = scanner.nextInt();
        
        calcSum(studentCount, scores , totals); // sum 계산
        calcAvg(studentCount, totalsAverages, totals); // avg 계산
        
	}
	
	
	public  static final int MAX_STUDENT = 5; // 총인원
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        int studentCount = 0;// 현인원
        // 2차원배열 : 이름, 국어, 영어, 수학
        String[] name = new String[MAX_STUDENT]; // 학생
        int[][] scores = new int[MAX_STUDENT][3]; // 각 학생 점수

        double[] totalAverages = new double[MAX_STUDENT]; // 각 학생의 평균
        int[] totals = new int[MAX_STUDENT]; // 각 학생의 총점

        boolean isRunning = true;
        while (isRunning) {
        	int menu = getMenu(scanner); 

            switch (menu) {
                case 1:
                    if (studentCount >= MAX_STUDENT) {
                        System.out.println("┌───────────◇────────────┐");
                        System.out.println("│ 학생 수를 초과했습니다 │");
                        System.out.println("└───────────◇────────────┘");
                        break;
                    }
                   studentCount = createStudent(studentCount,name, scores,totals, totalAverages, scanner);
                    break;
                case 2:
                    if (studentCount == 0) {
                        System.out.println("┌──────────◇─────┐");
                        System.out.println("│ 학생이 없습니다! 학생 추가가 필요합니다 │");
                        System.out.println("└──────────◇─────┘");
                        continue;
                    }
                    getPrint(studentCount,name, scores,totals, totalAverages, scanner);
                    break;
                case 3:
                    if (studentCount == 0) {
                        System.out.println("┌──────────◇─────┐");
                        System.out.println("│ 학생이 없습니다! 학생 추가가 필요합니다 │");
                        System.out.println("└──────────◇─────┘");
                        continue;
                    }
                    System.out.print("수정 번호:");
                    int updateNum = scanner.nextInt(); // 수정할 번호(인덱스)
                    // updateNum 수정 가능한 조건
                    // 최대 n보다 작거나 같아야함(총인원) 그리고
                    // 현재 인원 count 보다 작거나 같아야함
                    boolean isValid = isValidUpdate(updateNum, name);

                        if(isValid == true) {
                        updateStudent(name, scores,updateNum, scanner, studentCount, totals, totalAverages);
                        System.out.println("┌────◇──────┐");
                        System.out.println("│ 수정이 완료되었습니다     │");
                        System.out.println("└────◇──────┘");
                       }
                    break;
                case 4:
                    if (studentCount == 0) {
                        System.out.println("┌──────────◇─────┐");
                        System.out.println("│ 학생이 없습니다! 학생 추가가 필요합니다 │");
                        System.out.println("└──────────◇─────┘");
                        continue;
                    }
                    System.out.print("몇번 삭제: ");
                    int deleteNum = scanner.nextInt();
                    // 삭제 조건
                    // 1. 삭제할 번호가 n(5) 보단 작거나 같아야함 deleteNum <= n
                    // 2. 삭제할 번호가 현재 인원(count) 보다 작거나 같아야함 deleteNum <= count
                    int idxDelNum = deleteNum - 1;
                    // 범위 안에 있는지 + 해당 번호가 존재하는지
                    if (deleteNum > MAX_STUDENT) {
                        System.out.println("┌────◇──────┐");
                        System.out.println("│ 삭제하려는 번호가 큽니다   │");
                        System.out.println("└────◇──────┘");
                        continue;
                    }
                    if (deleteNum <= 0) {
                        System.out.println("┌─────◇──────────┐");
                        System.out.println("│ 삭제하려는 번호가 0 이거나 음수입니다  │");
                        System.out.println("└─────◇──────────┘");
                        continue;
                    }

                    if (name[idxDelNum] == null) {
                        System.out.println("┌──────◇────┐");
                        System.out.println("│ 삭제할려는 사람이 없습니다 │");
                        System.out.println("└──────◇────┘");
                        continue;
                    } else {
                        // 삭제하려는 값이 있다면
                        name[idxDelNum] = null;
                        for (int i = 0; i < scores[idxDelNum].length; i++) {
                            scores[idxDelNum][i] = 0;
                        }
                        System.out.println("┌──────◆─────┐");
                        System.out.println("│ 삭제가 완료되었습니다!      │");
                        System.out.println("└──────◆─────┘");
                    }
                    break;
                case 5:
                    if (studentCount == 0) {
                        System.out.println("┌──────────◇─────┐");
                        System.out.println("│ 학생이 없습니다! 학생 추가가 필요합니다 │");
                        System.out.println("└──────────◇─────┘");
                        continue;
                    }

                    System.out.println("┌─────◆──────┐");
                    System.out.println("│ 검색할 이름을 입력하세요     │");
                    System.out.println("└─────◆──────┘");
                    System.out.print(">>> ");

                    String searchName = scanner.next();

                    // 테스트
//                    System.out.println(searchName);
                    boolean isFind = false;

                    for (int i = 0; i < studentCount; i++) {
                        // null 부터 검사해야 됨 지운거 접근해서 NPE 발생함
                        if (name[i] != null && name[i].contains(searchName)) {
                            isFind = true;
                            // 테스트
//                            System.out.println("찾음1");
                            break;
                        }
                    }

                    if (isFind) {
                        System.out.print("번호\t이름\t국어\t영어\t수학\t총점\t평균\n");
                        for (int i = 0; i < studentCount; i++) {
                            if (name[i] != null && name[i].contains(searchName)) {
                                int sum = 0;
                                System.out.print(i + 1 + "\t");
                                System.out.print(name[i] + "\t");
                                // 국영수 출력
                                for (int j = 0; j < scores[i].length; j++) { // scores[i].length = 3
                                    System.out.print(scores[i][j] + "\t");
                                    totals[i] += scores[i][j]; // 누적 총점 계산(학생당)
                                    sum += scores[i][j];
                                }
                                totals[i] = sum;
                                totalAverages[i] = (double) sum / 3; // 총점 평균 계산 (학생당)
                                System.out.print(totals[i] + "\t");
                                System.out.print(String.format("%.2f", totalAverages[i]));
                                System.out.println();
                                
                            }
                        }
                    } else {
                        System.out.println("┌───◆─────┐");
                        System.out.println("│ 검색 결과가 없습니다  │");
                        System.out.println("└──◆──────┘");
                    }
                    break;
                case 6:
                    if (studentCount == 0) {
                        System.out.println("┌──────────◇─────┐");
                        System.out.println("│ 학생이 없습니다! 학생 추가가 필요합니다 │");
                        System.out.println("└──────────◇─────┘");
                        continue;
                    }
                    
                    // 총점 가져오는지 테스트
//                    for(int i = 0 ; i <MAX_STUDENT; i++) {
//                    	System.out.println(totals[i]);
//                    }
//                    
                    int temp = 0;
                 //  int[] sortIndex = new int[MAX_STUDENT];
                    int[] sortTemp = new int[MAX_STUDENT]; // 총점 배열 복사
                    
                    // 배열 복사
                    for(int i =0; i< studentCount; i++) {
                    	sortTemp[i] = totals[i];
                    }
                    
                    for(int i = 0; i < studentCount - 1; i++) {
                    	for(int j = 0; j < studentCount -1 -i; j++) {
                    		// totals 0 > totals 1번 보다 큰 경우
                    		if(sortTemp[j] < sortTemp[j+1]) {
                    			temp = sortTemp[j];
                    			sortTemp[j] = sortTemp[j+1];
                    			sortTemp[j+1] = temp;
                    		} 
                    		
                    		
                    	}
                    	
                    }
                    System.out.println("출력2: 총점기순으로 정렬");
//                     출력 테스트
//                    for(int n: totals) {
//                    	System.out.println(n);
//                    }
//                    
 
                	System.out.println("==== 출력 2===");
//                	 for (int i = 0; i < 3; i++) {
//                         totals[i] = 0;
//                         totalAverages[i] = 0;
//                     }
                     System.out.print("번호\t이름\t국어\t영어\t수학\t총점\t평균\n");
                     for (int i = 0; i < studentCount; i++) { // 학생 수 만큼 반복
                         if (name[i] != null) {
                        	 int sum = 0;
                        	 
                        	 for(int k = 0; k < studentCount; k++) {
                        		 if(sortTemp[i] == totals[k]) {
                        			 System.out.print(k + 1 + "\t");
                        			 System.out.print(name[k] + "\t");
                        			 // 국영수 출력
                        			 for (int j = 0; j < scores[i].length; j++) { // scores[i].length = 3
                        				 System.out.print(scores[k][j] + "\t");
//                        				 totals[k] += scores[k][j]; // 누적 총점 계산(학생당)
//                        				 sum += scores[k][j];
                        			 }
                        			 
//                        			 totals[k] = sum;
//                        			 totalAverages[k] = (double) sum / 3; // 총점 평균 계산 (학생당)
                        			 System.out.print(totals[k] + "\t");
                        			 System.out.print(String.format("%.2f", totalAverages[k]));
                        			 System.out.println();
                        		 }
                        			 
                        		 
                        		 
                        		 }
                        	 }
                        	 
                     }
                     System.out.println("┌─────◆────┐");
                     System.out.println("│ 출력완료             │");
                     System.out.println("└─────◆────┘");
                	
                	break;
                case 7:
                	// 파일 생성 및 쓰기
                	// 가져와야 될 변수
                	// name, scores, totals, totalsavg
                	
//                	String filePath = "D\\java\\javaBasic\\src\\ch07_method\\sec02_ex\\data\\save.txt";
                	//String filePath = ".\\data\save.txt";
//                	String filePath = "D:\\java\\javaBasic\\src\\ch07_method_sec02_ex\\data\\save.txt";
                	System.out.println("파일쓰기 작업 시작");
            		String filePath = "D:\\java\\javaBasic\\src\\ch07_method\\sec02_ex\\data\\save.txt";

                	File file = new File(filePath); // File 객체 생성
                	try {
						if(!file.exists()) { // 파일이 존재하지 않으면
							file.createNewFile(); // 신규 파일 생성
						}
						BufferedWriter bw = new BufferedWriter(new FileWriter(file, false));
						
						// 저장
						for(int i = 0; i < studentCount; i++) {
							String data;
							int s = 0;
							double d = 0.0;
							data = name[i];
							bw.write(data); // 학생 이름
							bw.write(","); // 구분자
							for(int j=0;j<3;j++) { 
								s = scores[i][j];
								bw.write(String.valueOf(s)); // 과목 3개
								bw.write(","); // 구분자
							}
							s = totals[i];
							bw.write(String.valueOf(s)); // 총점
							bw.write(",");
							d = totalAverages[i];
							bw.write(String.valueOf(d));
							bw.newLine();
						}					
						// 버퍼 및 스트림 뒷정리
						bw.flush(); // 버퍼의 남은 데이터 모두 쓰기
						bw.close(); // 스트림 종료
						System.out.println("저장 완료");
					} catch (Exception e) {
						// TODO: handle exception
					}
                	
                	// D:\java\javaBasic\src\ch07_method\sec02_ex\data\save.txt";
                	break;
                case 8:
                	// 파일 읽기
                	System.out.println("파일 읽기 작업 시작");
            		String filePathRead = "D:\\java\\javaBasic\\src\\ch07_method\\sec02_ex\\data\\save.txt";
                	File fileRead = new File(filePathRead); // File 객체 생성
                	try {
                		BufferedReader br = new BufferedReader(new FileReader(fileRead));
                		String line = null;
                		String[] nameTemp = null;
                		int c = 0;
                		studentCount = 0;
                		while((line = br.readLine()) !=null ) {
                			System.out.println(line);
                			nameTemp = line.split(",");
            				name[c] = nameTemp[0]; // 이름
            				scores[c][0] = Integer.parseInt(nameTemp[1]); // 국어
            				scores[c][1] = Integer.parseInt(nameTemp[2]); // 영어
            				scores[c][2] = Integer.parseInt(nameTemp[3]); // 수학
                			totals[c] = Integer.parseInt(nameTemp[4]);
                			totalAverages[c] = Double.parseDouble(nameTemp[5]);
                			c++;
                			studentCount++;
                		}
                		// 매핑s
//                		System.out.println("일단 출력을 던져");
//                		System.out.println(line);
                		
					br.close();
					} catch (Exception e) {
						// TODO: handle exception
					}
                	// 기존 변수에 매핑하는 작업

                	break;
                case 0:
                    isRunning = false;
                    System.out.println("┌────────────◆──────┐");
                    System.out.println("│ 프로그램이 종료되었습니다                 │");
                    System.out.println("└────────────◆──────┘");
                    break;
                default: // 123450 제외 다른입력시
                    System.out.println("┌────◇──────────┐");
                    System.out.println("│ 잘못입력셨습니다. 다시 입력해주세요.  │");
                    System.out.println("└────◇──────────┘");
                    break;
            }
        }
        scanner.close();
    }
}
