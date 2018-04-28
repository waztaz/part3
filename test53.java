class A {
    var x;
    var y;
    
    A() {
        x = 10;
        y = 2;
    }
}

class B extends A {
    var factor;
    
    B(f) {
        factor = f;
    }
    
    static function main() {
        var b = new B(4);
        return b.factor * (b.x + b.y);
    }
}

