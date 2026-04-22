class S24Q1
{
    public static void main(String[] args) {
        String text = "Kthm COllege Nashik";
        int scrollDelay = 200;
        int textWidth = 20;


        StringBuilder paddedText = new StringBuilder(textWidth * 2);
        for(int i = 0; i < textWidth; i++) {
            paddedText.append(" ");
        }
        paddedText.append(text);
        for(int i = 0; i < textWidth; i++) {
            paddedText.append(" ");
        }


        while(true) {
            for(int i = 0; i < textWidth; i++) {
                
                String substring = paddedText.substring(i, i + textWidth);

                
                System.out.print(substring);
                try {
                    Thread.sleep(scrollDelay);
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
                for(int j = 0; j < textWidth; j++) {
                    System.out.print("\b");
                }
            }
        }
    }
}

