abstract class AllHomework {
    abstract String homework();
}
/**
 * 实现类
 */
class Highermath extends AllHomework {
    @Override
    String homework() {
        return "泰勒公式";
    }
}

class English extends AllHomework {
    @Override
    String homework() {
        return "夜莺与玫瑰";
    }
}

class Xiandai extends AllHomework {
    @Override
    String homework() {
        return "第一章第一节";
    }
}


