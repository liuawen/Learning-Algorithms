const mergeTrees = (t1, t2) => {
    if (t1 == null && t2) {
        return t2;
    }
    if (t1 && t2 == null || t1 == null && t2 == null) {
        return t1;
    }
    t1.val += t2.val;

    t1.left = mergeTrees(t1.left, t2.left);
    t1.right = mergeTrees(t1.right, t2.right);

    return t1;
};

