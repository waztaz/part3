class A {
    var x = 0;
    
    function setSum(limit) {
        var sum = 0;
        while ((x = x + 1) < limit) {
            sum = sum + x;
        }
        return sum;
    }
    
    static function main () {
        var a = new A();
        var j = a.setSum(10);
        return (a.x * 200 + j);
    }
}
