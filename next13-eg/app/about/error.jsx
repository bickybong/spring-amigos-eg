"use client";
// 'use client' marks this page as a Client Component
// https://beta.nextjs.org/docs/rendering/server-and-client-components

export default function Error({ error, reset }) {
  return (
    <div>
      This ain't loading up: {error.message}
      <button onclick={() => reset()}>Reload</button>
    </div>
  );
}
