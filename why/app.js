
function miPrimeraFuncion(){
	console.log ("hola mundo");
	console.log	("estamos en noobscript");
}

console.log ("Un triangulo con base 5 y altura 6 tiene un area de " + 5*6/2)
console.log (`Un triangulo con base 5 y altura 6 tiene un area de: ${5*6/2}`)

let base = 5
let height = 6

let triangleArea = (base,height) => {
	return base * height / 2 
}
console.log (`Un triangulo con base ${base} y altura ${height} tiene un area de: ${triangleArea(base,height)}`)
triangleArea(base,height)

//sistema criptografico
let desencriptado ="NOOBscript"
function encriptarMensaje(desencriptado){
	if (desencriptado.toLowerCase().startsWith("b")) {
		helper = desencriptado.slice(2)
		desencriptado = "gro"+helper+"ne"
		return desencriptado
	} else {
		const tamaño = desencriptado.length
		if (tamaño % 2==0) {
			fHalf = desencriptado.slice(0,length/2)
			lHalf = desencriptado.slice(length/2)
			lHalf = lHalf.split("").reverse().join("")
			ffHalf = fHalf.slice(0,fHalf.length/2)
			flHalf = fHalf.slice(fHalf.length/2)
			lfHalf = lHalf.slice(0,lHalf.length/2)
			llHalf = lHalf.slice(lHalf.length/2)
			desencriptado = lfHalf + ffHalf +flHalf + llHalf
			return desencriptado
		} else {
			return "no se puede encriptar"
		}
	}
}

console.log (encriptarMensaje(desencriptado))


var Squirtle = {
	name: 'Squirtle',
	hp: 30,
	atk: 3.5,
	moves: {
		move1: 'tackle',
		move2: 'water gun',
		move3: 'tail-whip'
	},
	type: 'water',
	weakness: 'grass',
	picture: 'http://guidesmedia.ign.com/guides/059687/images/blackwhite/pokemans_007.gif'
}

var Charmander = {
	name: 'Charmander',
	hp: 20,
	atk: 5,
	move: {
		move1: 'scratch',
		move2: 'ember'
	},
	type: 'fire',
	weakness: 'water',
	picture: 'http://guidesmedia.ign.com/guides/059687/images/blackwhite/pokemans_004.gif'
}

var Bulbasaur = {
	name: 'Bulbasaur',
	hp: 37,
	atk: 2,
	move: {
		move1: 'razor leaf',
		move2: 'vine whip'
	},
	type: 'grass',
	weakness: 'fire',
	picture: 'http://guidesmedia.ign.com/guides/059687/images/blackwhite/pokemans_001.gif'
}

var Sandshrew = {
	name: 'Sandshrew',
	hp: 37,
	atk: 4,
	move: {
		move1: 'Sand attack',
		move2: 'Mud shot'
	},
	type: 'ground',
	weakness: 'water',
	picture: 'http://guidesmedia.ign.com/guides/059687/images/blackwhite/pokemans_027.gif'
}

function pokemonBattle (pkmn1, pkmn2){
	var c = document.createTextNode(`Empieza la batalla entre ${pkmn1.name} (${pkmn1.hp}hp) y ${pkmn2.name} (${pkmn2.hp}hp) `);
	document.body.appendChild(c);
	if (pkmn1.weakness == pkmn2.type){
		while (pkmn1.hp > 0 || pkmn2.hp > 0){
			pkmn1.hp = pkmn1.hp - (pkmn2.atk*3)
			pkmn2.hp = pkmn2.hp - pkmn1.atk
			if (pkmn1.hp <= 0 && pkmn2.hp > 0){
				var a = document.createTextNode(`${pkmn2.name} fue el ganador venciendo a ${pkmn1.name}`);
				return document.body.appendChild(a);
			} else if (pkmn2.hp <= 0 && pkmn1.hp > 0){
				var b = document.createTextNode(`${pkmn1.name} fue el ganador venciendo a ${pkmn2.name}`);
				return document.body.appendChild(b);
			} else{
				var para = document.createElement("P");
				var t = document.createTextNode(`La batalla entre ${pkmn1.name} y ${pkmn2.name} continua ferozmente, ${pkmn1.name} tiene ${pkmn1.hp}hp 
				y ${pkmn2.name} tiene ${pkmn2.hp}hp `);
    			para.appendChild(t);
    			document.body.appendChild(para);
			}
		}
	} else if (pkmn2.weakness == pkmn1.type){
		while (pkmn1.hp > 0 || pkmn2.hp > 0){
			pkmn1.hp = pkmn1.hp - pkmn2.atk
			pkmn2.hp = pkmn2.hp - (pkmn1.atk*3)
			if (pkmn1.hp <= 0 && pkmn2.hp > 0){
				var a = document.createTextNode(`${pkmn2.name} fue el ganador venciendo a ${pkmn1.name}`);
				return document.body.appendChild(a);
			} else if (pkmn2.hp <= 0 && pkmn1.hp > 0){
				var b = document.createTextNode(`${pkmn1.name} fue el ganador venciendo a ${pkmn2.name}`);
				return document.body.appendChild(b);
			} else{
				var para = document.createElement("P");
				var t = document.createTextNode(`La batalla entre ${pkmn1.name} y ${pkmn2.name} continua ferozmente, ${pkmn1.name} tiene ${pkmn1.hp}hp 
				y ${pkmn2.name} tiene ${pkmn2.hp}hp `);
    			para.appendChild(t);
    			document.body.appendChild(para);
			}
		}
	} else {
		while (pkmn1.hp > 0 || pkmn2.hp > 0){
			pkmn1.hp = pkmn1.hp - pkmn2.atk
			pkmn2.hp = pkmn2.hp - pkmn1.atk
			if (pkmn1.hp <= 0 && pkmn2.hp > 0){
				var a = document.createTextNode(`${pkmn2.name} fue el ganador venciendo a ${pkmn1.name}`);
				return document.body.appendChild(a);
			} else if (pkmn2.hp <= 0 && pkmn1.hp > 0){
				var b = document.createTextNode(`${pkmn1.name} fue el ganador venciendo a ${pkmn2.name}`);
				return document.body.appendChild(b);
			} else{
				var para = document.createElement("P");
				var t = document.createTextNode(`La batalla entre ${pkmn1.name} y ${pkmn2.name} continua ferozmente, ${pkmn1.name} tiene ${pkmn1.hp}hp 
				y ${pkmn2.name} tiene ${pkmn2.hp}hp `);
    			para.appendChild(t);
    			document.body.appendChild(para);
			}
		}
	}
} 	

 function choosePkmn1(){
 	if(document.getElementById('selectPkmn1').value == "sand") {
    	var fpkmn = document.getElementById('img1');
 		fpkmn.setAttribute("src", `${Sandshrew.picture}`);
 		fpkmn.setAttribute("width", "300px");
 		fpkmn.setAttribute("height", "auto");
 		document.getElementById("select1").remove();
 		document.img1.appendChild(fpkmn);
	} else if (document.getElementById('selectPkmn1').value == "char") {
 		var fpkmn = document.getElementById('img1');
 		fpkmn.setAttribute("src", `${Charmander.picture}`);
 		fpkmn.setAttribute("width", "300px");
 		fpkmn.setAttribute("height", "auto");
 		document.getElementById("select1").remove();
 		document.img1.appendChild(fpkmn);
 	} else if (document.getElementById('selectPkmn1').value == "squi"){
 		var fpkmn = document.getElementById('img1');
 		fpkmn.setAttribute("src", `${Squirtle.picture}`);
 		fpkmn.setAttribute("width", "300px");
 		fpkmn.setAttribute("height", "auto");
 		document.getElementById("select1").remove();
 		document.img1.appendChild(fpkmn);
 	} else {
 		var fpkmn = document.getElementById('img1');
 		fpkmn.setAttribute("src", `${Bulbasaur.picture}`);
 		fpkmn.setAttribute("width", "300px");
 		fpkmn.setAttribute("height", "auto");
 		document.getElementById("select1").remove();
 		document.img1.appendChild(fpkmn);
 	}
 		var pokemon1Ready = true;
		return pokemon1Ready;
 }

 function choosePkmn2(){
 	if(document.getElementById('selectPkmn2').value == "sand") {
    	var fpkmn = document.getElementById('img2');
 		fpkmn.setAttribute("src", `${Sandshrew.picture}`);
 		fpkmn.setAttribute("width", "300px");
 		fpkmn.setAttribute("height", "auto");
 		document.getElementById("select2").remove();
 		return document.img2.appendChild(fpkmn);
	} else if (document.getElementById('selectPkmn2').value == "char") {
 		var fpkmn = document.getElementById('img2');
 		fpkmn.setAttribute("src", `${Charmander.picture}`);
 		fpkmn.setAttribute("width", "300px");
 		fpkmn.setAttribute("height", "auto");
 		document.getElementById("select2").remove();
 		return document.img2.appendChild(fpkmn);
 	} else if (document.getElementById('selectPkmn2').value == "squi"){
 		var fpkmn = document.getElementById('img2');
 		fpkmn.setAttribute("src", `${Squirtle.picture}`);
 		fpkmn.setAttribute("width", "300px");
 		fpkmn.setAttribute("height", "auto");
 		document.getElementById("select2").remove();
 		return document.img2.appendChild(fpkmn);
 	} else {
 		var fpkmn = document.getElementById('img2');
 		fpkmn.setAttribute("src", `${Bulbasaur.picture}`);
 		fpkmn.setAttribute("width", "300px");
 		fpkmn.setAttribute("height", "auto");
 		document.getElementById("select2").remove();
 		document.img2.appendChild(fpkmn);
 	}
 	 	var pokemon2Ready = true;
 		return pokemon2Ready;
}

 function pkmnBattle(){
 	var sel = document.getElementById("selectPkmn1");
	var y = sel.options[sel.selectedIndex].text;
 	var sol = document.getElementById("selectPkmn2");
	var z = sol.options[sol.selectedIndex].text;
	if (y==Charmander.name&&z==Squirtle.name){
	 	return pokemonBattle(Charmander,Squirtle);
 	} else if (y==Charmander.name&&z==Bulbasaur.name){
	 	return pokemonBattle(Charmander,Bulbasaur);
 	} else if (y==Charmander.name&&z==Sandshrew.name){
	 	return pokemonBattle(Charmander,Sandshrew);
 	} else if (y==Bulbasaur.name&&z==Charmander.name){
	 	pokemonBattle(Bulbasaur,Charmander);
 	} else if (y==Bulbasaur.name&&z==Squirtle.name){
	 	return pokemonBattle(Bulbasaur,Squirtle);
 	} else if (y==Bulbasaur.name&&z==Sandshrew.name){
	 	return pokemonBattle(Bulbasaur,Sandshrew);
 	} else if (y==Squirtle.name&&z==Charmander.name){
	 	return pokemonBattle(Squirtle,Charmander);
 	} else if (y==Squirtle.name&&z==Bulbasaur.name){
	 	return pokemonBattle(Squirtle,Bulbasaur);
 	} else if (y==Squirtle.name&&z==Sandshrew.name){
	 	return pokemonBattle(Squirtle,Sandshrew);
 	} else if (y==Sandshrew.name&&z==Charmander.name){
	 	return pokemonBattle(Sandshrew,Charmander);
 	} else if (y==Sandshrew.name&&z==Bulbasaur.name){
	 	return pokemonBattle(Sandshrew,Bulbasaur);
 	} else {
	 	return pokemonBattle(Sandshrew,Squirtle);
 	}
 	var pkmnBattleReady = true;
 	return pkmnBattleReady;
 }

