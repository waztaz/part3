class A {
    var x = 1;
    var y = x + 1;
    var z = x + y + 1;
    
    A(a) {
        x = a;
    }
    
    A(a, b) {
        x = a;
        y = b;
    }
    
    static function main() {
        var a = new A(10);
        var b = new A(20, 5);
        
        return (a.x + a.y + a.z) * 100 + (b.x + b.y + b.z);
    }
}
