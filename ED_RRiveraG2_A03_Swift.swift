
class FetchClass {
    var vctr: [Int] = []
    func fetch(n: Int)->Int{
        preconditionFailure("This method must be overridden")
    }
    func setV(v: [Int]){
        self.vctr = v
    }
    func randomV(n:Int)->[Int]{
        var v:[Int] = [Int]()
        for _ in 0...(n-1) {
            v.append(Int(arc4random_uniform(200)))
        }
        return v
    }
    func getV()->[Int]{
        return self.vctr
    }
    func showV(){
        let count:Int = self.vctr.count-1
        var string = "["
        for(index) in 0...count{
            string+=String(self.vctr[index])
            string+=","
        }
        string = String(string.characters.dropLast()) + "]"
        print(string)
    }
    func showF(n: Int){
        if(n==(-1)){print("El numero que busca no existe en el vecto")}
        else
        {print("El numero se encuentra en la posición \(n)")}
    }
}
class binario: FetchClass{
    override func fetch(n: Int) -> Int {
        var centro: Int = 0
        var inicio: Int = 0
        var fin: Int = self.vctr.count-1
        
        while(inicio<=fin){
            centro=(inicio+fin)/2
            
            if(self.vctr[centro]==n){return centro}
            
            if(n < self.vctr[centro]){
                fin = centro-1
            } else {
                inicio = centro+1
            }
        }
        return -1
    }
}

class secuencial: FetchClass{
    override func fetch(n: Int) -> Int {
        let count:Int = self.vctr.count-1
        for i in 0...count{
            if(self.vctr[i]==n){return i}
        }
        return -1
    }
}

var test: secuencial = secuencial()
test.setV(v: test.randomV(n: 400))
test.showV()
test.showF(n: test.fetch(n: 50))