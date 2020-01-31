import { CustompipePipe } from './custompipe.pipe';
function greetings() {
  return 'Good Morning';
}
describe('CustompipePipe', () => {
  let expected = '';
  beforeEach(() => {
    expected = 'Good Morning';
  });
  afterEach(() =>{
    expected='';
  });
  fit('My Greeting Message',() => {
    expect(greetings()).toEqual(expected);
  });
});
