package Assignment;
import java.util.Scanner;

class Day { 
    private String work;
    public void set(String work) { this.work = work; }
    public String get() { return work; }
    public void show() {
        if (work == null) System.out.println("할 일이 없습니다.");
        else System.out.println(work + " 입니다.");
    }
}

public class MonthSchedule {
    private Day[] days;
    Scanner scanner = new Scanner(System.in);

    public MonthSchedule(int totalDays) {
        days = new Day[totalDays];
        for (int i = 0; i < totalDays; i++) {
            days[i] = new Day();
        }
    }

    public void input() {
        System.out.print("입력할 날짜: ");
        int day = scanner.nextInt();
        scanner.nextLine();
        System.out.print("할 일 입력: ");
        String work = scanner.nextLine();
        days[day - 1].set(work);
    }

    public void view() {
        System.out.print("날짜 입력: ");
        int day = scanner.nextInt();
        System.out.print(day + " 일 : ");
        days[day - 1].show();
    }

    public void viewMonth() {
        boolean isThereAnySchedule = false;

        for (int i = 0; i < days.length; i++) {
            if(days[i].get() != null && !days[i].get().isEmpty()) {
                System.out.print((i + 1) + " 일 : ");
                days[i].show();
                isThereAnySchedule = true;
            }
        }
        
        if (!isThereAnySchedule) {
            System.out.println("등록된 일정이 없습니다.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MonthSchedule October = new MonthSchedule(31); 
        System.out.println("10월의 스케줄 관리 프로그램");
        boolean isContinued = true;
        while (isContinued) {
            System.out.println("1. 할 일 입력  2. 할 일 보기  3. 전체 할 일 보기  4. 종료   : ");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    October.input();
                    break;
                case 2:
                    October.view();
                    break;
                case 3:
                    October.viewMonth();
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    isContinued = false;
                    break;
                default:
                    System.out.println("메뉴를 잘못 선택하였습니다.");
                    break;
            }
        }
        scanner.close();
    }
}
