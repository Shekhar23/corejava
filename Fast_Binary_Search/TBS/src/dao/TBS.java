package dao;

import java.util.ArrayList;

import Log.TBSLog;
import bean.TreeNode;
import util.EntityList;
import util.IdList;

public class TBS {

	private static TBS t1;
	private ArrayList<TreeNode> searchTree;
	private IdList idList;
	private EntityList entityList;

	public static TBS getTBS() {
		if (t1 == null) {
			t1 = new TBS();
		}
		return t1;
	}

	private void init() {
		searchTree = new ArrayList<>();
		idList = new IdList();
		entityList = new EntityList();
	}

	public void create() {
		init();
	}

	public void createTreeByArrayList(ArrayList<TreeNode> nodeList) {
		for (TreeNode treeNode : nodeList) {
			insertIntoNodeTree(treeNode.getId(), treeNode.getEntity(), treeNode.getTages());
		}
	}

	private boolean insertIntoNodeTree(int id, String entity, String[] tages) {
		boolean status = false;
		if (searchTree != null) {
			TreeNode node = new TreeNode();
			node.setEntity(entity);
			node.setId(id);
			node.setTages(tages);
			if (verifyNode(node)) {
				searchTree.add(node);
				status = true;
				TBSLog.d("Node is inserted to tree tages ");
				TBSLog.d("Data is sotore to dataset now size of data set is " + searchTree.size());
			} else {
				TBSLog.er("Node is not inserted to tree");
			}
		} else {
			status = false;
			TBSLog.ex("You can not insert. Search tree is not created yet...!!");
		}
		return status;
	}

	private boolean verifyNode(TreeNode node) {
		boolean status = false;
		if (verifyEntity(node.getEntity()) && verifyId(node.getId())) {
			status = true;
		} else {
			TBSLog.er("Please check Node : Node verification failed..!!!");
		}
		return status;
	}

	private boolean verifyId(int id) {
		boolean status = false;
		if (!idList.contains(id)) {
			status = true;
		} else {
			TBSLog.er("Please check id : " + id + ", May be it is all ready presentin tree");
		}
		return status;
	}

	private boolean verifyEntity(String entity) {
		boolean status = false;
		if (!entityList.contains(entity)) {
			status = true;
		} else {
			TBSLog.er("Please check Entity : " + entity + ", May be it is all ready presentin tree");
		}
		return status;

	}

	public ArrayList<TreeNode> search(String str) {
		ArrayList<TreeNode> searchResult = new ArrayList<>();
		for (int i = 0; i < searchTree.size(); i++) {
			TreeNode treeNode = searchTree.get(i);
			String tagArray[] = treeNode.getTages();
			for (int j = 0; j < tagArray.length; j++) {
				String temp = tagArray[j];
				if (temp.toLowerCase().contains(str.toLowerCase())) {
					 searchResult.add(treeNode);
					 TBSLog.d("Matched Tag : "+temp+ "from entity : "+temp);
				}
			}
		}
		return searchResult;
	}
}
