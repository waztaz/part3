class Box {
    static var countAccesses = 0;
    var size = 1;
    
    function setSize(s) {
        this.size = s;
        countAccesses = countAccesses + 1;
    }
    
    static function main() {
        var x = 0;
        var c;
        
        while (x < 10) {
            var a = new Box();
            a.setSize(x + countAccesses);
            if (a.size % 4 == 0)
                c = a;
            x = x + 1;
        }
        
        return c.size;
    }
}
