package controller;

import java.util.ArrayList;

import bean.TreeNode;
import dao.TBS;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] indaia = { "Mumbai", "New Delhi", "Bangalore", "Hyderabad", "Kolkata", "Chennai" };
		String[] usa = { "Chicago", "Las Vegas", "Washington", "California", "New Orleans", "Palm Springs" };
		String[] russia = { "Moscow", "Saint Petersburg", "Novosibirsk", "omask", "kazan", "Chennai" };

		TreeNode treeNode1 = new TreeNode();
		treeNode1.setEntity("india");
		treeNode1.setId(3);
		treeNode1.setTages(indaia);

		TreeNode treeNode2 = new TreeNode();
		treeNode2.setEntity("usa");
		treeNode2.setId(2);
		treeNode2.setTages(usa);

		TreeNode treeNode3 = new TreeNode();
		treeNode3.setEntity("russia");
		treeNode3.setId(1);
		treeNode3.setTages(russia);

		ArrayList<TreeNode> nodeList = new ArrayList<>();
		nodeList.add(treeNode1);
		nodeList.add(treeNode2);
		nodeList.add(treeNode3);

		TBS tbs = TBS.getTBS();
		tbs.create();
		tbs.createTreeByArrayList(nodeList);
		ArrayList<TreeNode> sl = tbs.search("Mu");
		System.out.println("number of result found : " + sl.size());
		for (TreeNode treeNode : sl) {
			System.out.println("Entity : " + treeNode.getEntity());
			System.out.println("serch id : " + treeNode.getId());
			//System.out.println("serch Tag : " + treeNode.getTages());
		}

	}

}
