 export default function Block(props) {
  return (
    <div {...props} style={{ border: "1px solid black", padding: "1rem" }}>
      {props.children}
    </div>
  );
}
