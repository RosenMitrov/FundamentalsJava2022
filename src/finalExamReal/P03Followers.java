package finalExamReal;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03Followers {
    static class Follower {
        private String username;
        private int like;
        private int comment;

        public Follower(String username, int like, int comment) {
            this.username = username;
            this.like = like;
            this.comment = comment;
        }

        public String getUsername() {
            return username;
        }

        public int getLike() {
            return like;
        }

        public int getComment() {
            return comment;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public void setLike(int like) {
            this.like = like;
        }

        public void setComment(int comment) {
            this.comment = comment;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Follower> followerMap = new LinkedHashMap<>();
        while (!input.equals("Log out")) {
            String[] data = input.split(": ");
            String command = data[0];
            String usernameC = data[1];
            switch (command) {
                case "New follower":
                    if (!followerMap.containsKey(usernameC)) {
                        Follower currentFollower = new Follower(usernameC, 0, 0);
                        followerMap.put(usernameC, currentFollower);
                    }
                    break;
                case "Like":
                    int countOfLikes = Integer.parseInt(data[2]);
                    getLikes(followerMap, usernameC, countOfLikes);
                    break;
                case "Comment":
                    getComments(followerMap, usernameC);
                    break;
                case "Blocked":
                    getBlockedIfConsist(followerMap, usernameC);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("%d followers%n", followerMap.size());

        for (Map.Entry<String, Follower> entry : followerMap.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().getLike() + entry.getValue().getComment());
        }
    }

    private static void getBlockedIfConsist(Map<String, Follower> followerMap, String usernameC) {
        if (followerMap.containsKey(usernameC)) {
            followerMap.remove(usernameC);
        } else {
            System.out.printf("%s doesn't exist.%n", usernameC);
        }
    }

    private static void getLikes(Map<String, Follower> followerMap, String usernameC, int countOfLikes) {
        if (!followerMap.containsKey(usernameC)) {
            Follower currentFollower = new Follower(usernameC, countOfLikes, 0);
            followerMap.put(usernameC, currentFollower);
        } else {
            Follower follower = followerMap.get(usernameC);
            int currentLikes = follower.getLike();
            follower.setLike(currentLikes + countOfLikes);
        }
    }

    private static void getComments(Map<String, Follower> followerMap, String usernameC) {
        if (!followerMap.containsKey(usernameC)) {
            Follower currentFollower = new Follower(usernameC, 0, 1);
            followerMap.put(usernameC, currentFollower);
        } else {
            Follower follower = followerMap.get(usernameC);
            int currentCommentCount = follower.getComment();
            currentCommentCount++;
            follower.setComment(currentCommentCount);

        }
    }


}
