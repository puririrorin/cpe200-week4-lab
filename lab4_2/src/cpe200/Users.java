package cpe200;
import java.util.ArrayList;

public class Users {
    public ArrayList<User> userList;
    public Users() {
        userList = new ArrayList<>();
    }

        public void addUser (User user){
            userList.add(user);
        }


        public void addUser (String userName, String password){
            User user = new User();

            user.setUserName(userName);
            user.setPassword(password);

            userList.add(user);

        }

        public void deleteUser (User user){
            userList.remove(user);

        }

        public boolean exists (User user)
        {

            return userList.contains(user);
        }

        public boolean usernameExists (String username)
        {


            return username.contains(username);
        }

        public User getUserByUsername (String userName){

            for (int j = 0; j < userList.size(); j++) {

                if (userList.get(j).getUserName() == userName) {

                    return userList.get(j);
                }

            }
            return null;
        }

        public int count ()
        {


            return userList.size();
        }


        public User[] getUserArray ()
        {

            return userList.toArray(new User[0]);
        }
    }