int insert(String s, ArrayList<String> L)
{
    int i;
    for (i = 0; i < L.size(); i++) {
        if (s.compareTo(L.get(i)) <= 0) {
            break;
        }
    }
    
    L.add(i,s);
    return i;
}

ArrayList<String> a = new ArrayList<>();
